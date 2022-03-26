let products = [
    {
        id: 1,
        name: "Quả bóng chày",
        price: 5000,
        image: "Quả_bóng_chày.jpg"
    },
    {
        id: 2,
        name: "Bộ bóng chày",
        price: 150000,
        image: "Bộ_bóng_chày1.jpg"
    },
    {
        id: 3,
        name: "Bóng chuyền",
        price: 10000,
        image: "bong_chuyen1.jpg"
    },
    {
        id: 4,
        name: "Giáp Taekwondo",
        price: 100000,
        image: "Giáp_TaeKwondo.jpg"
    },
    {
        id: 5,
        name: "Bóng đá",
        price: 10000,
        image: "bong_da1.jpg"
    },
    {
        id: 6,
        name: "Vợt Tennis",
        price: 60000,
        image: "Vợt_tennis1.jpg"
    },
    {
        id: 7,
        name: "Gậy bóng chày",
        price: 80000,
        image: "Gậy_bóng_chày.jpg"
    },
    {
        id: 8,
        name: "Vợt cầu lông",
        price: 30000,
        image: "Vợt_cầu_lông2.jpg"
    },
    {
        id: 9,
        name: "Võ phục Karate",
        price: 80000,
        image: "Võ_phục_karate.jpg"
    },
    {
        id: 10,
        name: "Hán phục",
        price: 100000,
        image: "Han_phuc.jpeg"
    },
    {
        id: 11,
        name: "Bảo hộ hạ bộ",
        price: 80000,
        image: "Bảo_hộ_hạ_bộ.jpg"
    },
    {
        id: 12,
        name: "Áo dài",
        price: 100000,
        image: "Áo_dài.jpg"
    },
    {
        id: 13,
        name: "Áo bà ba",
        price: 100000,
        image: "Ao_ba_ba.jpeg"
    },

];
let arrProducts = [];
let totalPrice = 0;

function changeProduct(value) {
    let productImage = document.getElementById("product-image");
    let image = 'assets/img/portfolio/' + value;
    let price = 0;
    document.getElementById("number").value = 0;
    document.getElementById("time").value = 0;

    productImage.style.visibility = "visible";
    if (value === "") {
        image = "";
        productImage.style.visibility = "hidden";
        price = 0;
    };

    productImage.src = image;

    if (value !== "") {
        let product = products.filter(item => item.image === value)[0];
        price = product.price;
    }
    document.getElementById("product-price").value = price;
}

function calculatorPrice() {
    let price = document.getElementById("product-price").value;
    let groupTotalPrice = document.getElementById("total-price");

    if (price === "" || parseInt(price) === 0) {
        groupTotalPrice.style.visibility = "hidden";
        alert('Vui lòng chọn sản phẩm!');
        return;
    }

    groupTotalPrice.style.visibility = "visible";
}

function calculatorBill() {
    console.log('calculatorBill');
}

function cal() {
  let productSelected = document.getElementById("products").value;
  let product = products.filter((item) => item.image === productSelected)[0];
  let number = document.getElementById("number").value;
  let time = document.getElementById("time").value;
  let price = 1;
  let total = 0;

  price = number * product.price;

  if (time > 3) {
    total = price + (((price / number) * 10) / 100) * (time - 3) * number;
  } else {
    total = price;
  }

  let productCalculator = {
    product_name: product.name,
    quantity: number,
    time: time,
    price: price,
    total: total,
  };
  arrProducts.push(productCalculator);

  // Loại bỏ các productCalculator bị trùng
  arrProducts = [...new Map(arrProducts.map((item) => [item.product_name, item])).values()];

  let productDisplay = document.getElementById("item");
  productDisplay.innerHTML = '';

  totalPrice = 0;
  arrProducts.forEach( (product, i) => {
    productDisplay.innerHTML += 
        `<tr>
            <th scope="row">${i + 1}</th>
            <td>${product.product_name}</td>
            <td>${product.quantity}</td>
            <td>${product.time}</td>
            <td>${product.price}</td>
            <td>${product.total}</td>
        </tr>`;
     totalPrice += product.total;
  });

  document.getElementById("thanh_tien").value = totalPrice;
  // document.getElementById("id_btn_show").style.display = "block"
}

show = () => {
    document.getElementById("detail").style.display = "block";
    document.getElementById("total").innerHTML = totalPrice;
}

cls = () => {
    document.getElementById("detail").style.display = "none";
}