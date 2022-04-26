changeName = () => {
	let name = document.getElementById("name").value;
	if (name == "") {
		document.getElementById("info-change-name").innerHTML = `<p style="color: #e74c3c;">Invalid input<p>`
	}
	else {
		$.ajax({
			url: '/management/admin',
			type: 'GET',
			data: {
				newName: name
			},
			success: function(data) {
				const res = JSON.parse(data);
				if (res.status == true) {
					document.getElementById("info-change-name").innerHTML = `<p style="color: #2980b9;">${res.message}<p>`
				}
			}
		});
	}
}

changePassword = () => {
	let cur = document.getElementById("cur-password").value;
	let newP = document.getElementById("new-password").value;
	if (newP == "" || cur == "") {
		document.getElementById("info-change-name").innerHTML = `<p style="color: #e74c3c;">Invalid input<p>`
	}
	else {
		$.ajax({
			url: '/management/admin',
			type: 'GET',
			data: {
				currentPassword: cur,
				newPassword: newP
			},
			success: function(data) {
				const res = JSON.parse(data);
				const color = (res.status == true) ? "#2980b9" : "#e74c3c";
				document.getElementById("info-change-password").innerHTML = `<p style="color: ${color}">${res.message}<p>`;
				document.getElementById("cur-password").value = "";
				document.getElementById("new-password").value = "";
			}
		});
	}
}