	function toAdvanceSearch() {
		var divMyTitle = document.getElementById("divMyTitle");
		var divContainer = document.getElementById("divContainer");
		var btnAdvanceSearch = document.getElementById("btnAdvanceSearch");

		//		btnAdvanceSearch.style.display = "none";
		if (divContainer.style.display != "block") {
			divMyTitle.style.marginTop = "0px";

			divContainer.style.display = "block";
		} else {
			divContainer.style.display = "none";
			divMyTitle.style.marginTop = "150px";

		}
		

	}