function openPage(pageURL) {
    window.location.href = pageURL;
}

function confirmDelete(path, id) {
    if (confirm("Are you sure to delete category has id = " + id + "?") == true) {
		window.location.href = path + "/" + id;
    }
}