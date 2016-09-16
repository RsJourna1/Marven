package dao.impl;

import dao.BaseDao;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 郑晓辉 on 2016/8/11.
 */
public class BaseDaoImpl<T> implements BaseDao<T> {
    //Dao组件进行持久化操作底层依赖的SessionFactory组件
    private SessionFactory sessionFactory;

    //依赖SessionFactory所需的setter方法
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return this.sessionFactory;
    }

    // 根据ID加载实体
    @SuppressWarnings("unchecked")
    public T get(Class<T> entityClazz, Serializable id) {
        return (T) getSessionFactory().getCurrentSession()
                .get(entityClazz, id);
    }

    // 保存实体
    public Serializable save(T entity) {
        return getSessionFactory().getCurrentSession()
                .save(entity);
    }

    // 更新实体
    public void update(T entity) {
        getSessionFactory().getCurrentSession().saveOrUpdate(entity);
    }

    // 删除实体
    public void delete(T entity) {
        getSessionFactory().getCurrentSession().delete(entity);
    }

    // 根据ID删除实体
    public void delete(Class<T> entityClazz, Serializable id) {
        getSessionFactory().getCurrentSession()
                .createQuery("delete " + entityClazz.getSimpleName()
                        + " en where en.id = ?0")
                .setParameter("0", id)
                .executeUpdate();
    }

    // 获取所有实体
    public List<T> findAll(Class<T> entityClazz) {
        return find("select en from "
                + entityClazz.getSimpleName() + " en");
    }
    // 获取实体总数

    public long findCount(Class<T> entityClazz) {
        List<?> l = find("select count(*) from "
                + entityClazz.getSimpleName());
        //返回查询得到的实体总数
        if (l != null && l.size() == 1) {
            return (Long) l.get(0);
        }
        return 0;
    }

    //根据HQL语句查询实体
    @SuppressWarnings("unchecked")
    protected List<T> find(String hql) {
        return (List<T>) getSessionFactory().getCurrentSession()
                .createQuery(hql)
                .list();
    }
    //根据HQL语句查询实体总数
    @SuppressWarnings("unchecked")
    public long findTotalRecords(String hql){
        return getSessionFactory().getCurrentSession()
                .createQuery(hql)
                .list().size();
    }

    //根据带占位符参数的HQL语句查询实体
    @SuppressWarnings("unchecked")
    protected List<T> find(String hql, Object... params) {
        // 创建查询
        Query query = getSessionFactory().getCurrentSession()
                .createQuery(hql);
        // 为包含占位符的HQL语句设置参数
        for (int i = 0, len = params.length; i < len; i++) {
            query.setParameter(i + "", params[i]);
        }
        return (List<T>) query.list();
    }

    /**
     * 使用HQL语句进行分页查询操作
     *
     * @param hql
     * @param pageNo
     * @param pageSize
     * @return
     */
    @SuppressWarnings("unchecked")
    protected List<T> findByPage(String hql, int pageNo, int pageSize) {
        // 创建查询
        return getSessionFactory().getCurrentSession()
                .createQuery(hql)
                //执行分页
                .setFirstResult((pageNo - 1) * pageSize)
                .setMaxResults(pageSize)
                .list();
    }

    /**
     * 使用HQL语句进行分页查询操作
     *
     * @param hql
     * @param pageNo
     * @param pageSize
     * @param params   如果HQL语句带占位符参数，params用于传入占位符参数
     * @return
     */
    @SuppressWarnings("unchecked")
    protected List<T> findByPage(String hql, int pageNo, int pageSize
            , Object... params) {
        // 创建查询
        Query query = getSessionFactory().getCurrentSession()
                .createQuery(hql);
        // 为保含占位符的HQL语句设置参数
        for (int i = 0, len = params.length; i < len; i++) {
            query.setParameter(i + "", params[i]);
        }
        // 执行分页，返回查询结果
        return query.setFirstResult((pageNo - 1) * pageSize)
                .setMaxResults(pageSize)
                .list();
    }
}


//public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {
//    //根据ID加载实体
//    public T get(Class<T> entityClazz, Serializable id)
//    {
//        return getHibernateTemplate().get(entityClazz, id);
//    }
//    //保存实体
//    public Serializable save(T entity)
//    {
//        return getHibernateTemplate().save(entity);
//    }
//    //更新实体
//    public void update(T entity)
//    {
//        getHibernateTemplate().saveOrUpdate(entity);
//    }
//    // 删除实体
//    public void delete(T entity)
//    {
//        getHibernateTemplate().delete(entity);
//    }
//    // 根据ID删除实体
//    public void delete(Class<T> entityClazz, Serializable id)
//    {
//        delete(get(entityClazz , id));
//    }
//    // 获取所有实体
//    @Override
//    @SuppressWarnings("unchecked")
//    public List<T> findAll(Class<T> entityClazz)
//    {
//        return (List<T>)getHibernateTemplate().find("select en from "
//                + entityClazz.getSimpleName() + " en");
//    }
//    // 获取实体总数
//    @Override
//    @SuppressWarnings("unchecked")
//    public long findCount(Class<T> entityClazz)
//    {
//        List<Long> list = (List<Long>)getHibernateTemplate().find(
//                "select count(*) from " + entityClazz.getSimpleName() + " en");
//        return list.get(0);
//    }
//
//    /**
//     * 使用hql语句进行分页查询
//     * @param hql
//     * @param pageNo
//     * @param pageSize
//     * @return 当前页所有记录
//     */
//    @SuppressWarnings("unchecked")
//    protected List<T> findByPage(final String hql,
//                                 final int pageNo, final int pageSize)
//    {
//        // ͨ通过一个HibernateCallback对象来执行查询
//        List<T> list = getHibernateTemplate().execute(new HibernateCallback<List<T>>()
//                {
//                    // 实现HibernateCallback接口必须实现的方法
//                    public List<T> doInHibernate(Session session)
//                    {
//                        // ִ执行Hibernate分页查询
//                        List<T> result = session.createQuery(hql)
//                                .setFirstResult((pageNo - 1) * pageSize)
//                                .setMaxResults(pageSize)
//                                .list();
//                        return result;
//                    }
//                });
//        return list;
//    }
//
//    /**
//     * 使用HQL语句进行分页查询操作
//     * @param hql
//     * @param pageNo
//     * @param pageSize
//     * @param params 如果hql带有占位符参数，params用于传入占位符参数
//     * @return
//     */
//    @SuppressWarnings("unchecked")
//    protected List<T> findByPage(final String hql , final int pageNo,
//                                 final int pageSize , final  Object... params)
//    {
//        // 通过一个HibernateCallback对象来执行查询
//        List<T> list = getHibernateTemplate().execute(new HibernateCallback<List<T>>()
//                {
//                    // 实现HibernateCallback接口必须实现的方法
//                    public List<T> doInHibernate(Session session)
//                    {
//                        // 执行Hibernate分页查询
//                        Query query = session.createQuery(hql);
//                        // 为包含占位符的HQL语句设置参数
//                        for(int i = 0 , len = params.length ; i < len ; i++)
//                        {
//                            query.setParameter(i + "" , params[i]);
//                        }
//                        List<T> result = query.setFirstResult((pageNo - 1) * pageSize)
//                                .setMaxResults(pageSize)
//                                .list();
//                        return result;
//                    }
//                });
//        return list;
//    }
//
//}
