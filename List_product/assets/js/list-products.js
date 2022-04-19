const products = [
    {
        id: 1,
        name: "Quả bóng chày",
        price: 5000,
        link: "Qua_bong_chay.html",
        image: "Quả_bóng_chày.jpg",
    },
    {
        id: 2,
        name: "Bộ bóng chày",
        price: 150000,
        link: "bo_bong_chay.html",
        image: "Bộ_bóng_chày1.jpg"
    },
    {
        id: 3,
        name: "Bóng chuyền",
        price: 10000,
        link: "bong_chuyen1.html",
        image: "bong_chuyen1.jpg"
    },
    {
        id: 4,
        name: "Giáp Taekwondo",
        price: 100000,
        link: "giap_taekwondo.html",
        image: "Giáp_TaeKwondo.jpg"
    },
    {
        id: 5,
        name: "Bóng đá",
        price: 10000,
        link: "Bong_da.html",
        image: "bong_da1.jpg"
    },
    {
        id: 6,
        name: "Vợt Tennis",
        price: 60000,
        link: "vot_tennis.html",
        image: "Vợt_tennis1.jpg"
    },
    {
        id: 7,
        name: "Vợt cầu lông",
        price: 30000,
        link: "Vợt_cầu_lông.html",
        image: "Vợt_cầu_lông2.jpg"
    },
    {
        id: 8,
        name: "Võ phục Karate",
        price: 80000,
        link: "Võ_phục_karate.html",
        image: "Võ_phục_karate.jpg"
    },
    {
        id: 9,
        name: "Gậy bóng chày",
        price: 80000,
        link: "Gay_bong_chay.html",
        image: "Gậy_bóng_chày.jpg"
    },
    {
        id: 10,
        name: "Bảo hộ hạ bộ",
        price: 80000,
        link: "Bảo_hộ_hạ_bộ.html",
        image: "Bảo_hộ_hạ_bộ.jpg"
    },
    {
        id: 11,
        name: "Hán phục",
        price: 100000,
        link: "Hán_phục.html",
        image: "Han_phuc.jpeg"
    },
    {
        id: 12,
        name: "Áo dài",
        price: 100000,
        link: "Áo_Dài.html",
        image: "Áo_dài.jpg"
    },
    {
        id: 13,
        name: "Áo bà ba",
        price: 100000,
        link: "Áo_bà_ba.html",
        image: "Ao_ba_ba.jpeg"
    },

];

// Init products
function initListProducts(arrProducts) {
    let listProducts = document.getElementById("posts");
    listProducts.innerHTML = '';

    for (let i = 0; i < arrProducts.length; i++) {
        let product = arrProducts[i];
        let classElement = addClass(product.id);
    
        let html = 
            `<div id="${i + 1}" class="item item-grid${classElement}">
                <div class="item-wrap">
                    <div class="work-item">
                        <div class="work-pic">
                            <img src="assets/img/portfolio/${product.image}" alt="image">
                        </div>
                        <div class="hover-content">
                            <div class="hover-text text-center">
                                <a href="assets/img/portfolio/${product.image}"
                                    data-lightbox="roadtrip"><span class="ti-fullscreen"></span></a>
                            </div>
                            <div class="project-description text-uppercase ul-li">
                                <h3><a href="${product.link}">${product.name}</a></h3>
                                <ul class="project-catagorry text-capitalize">
                                    <li><a href="#">${product.price}VNĐ </a></li>
                                    <br>
                                    <li><a href="#">Còn hàng</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>`;
    
        listProducts.innerHTML += html;
    };
}

// Check which id need to add class
function addClass(id) {
    let classElement = '';

    switch (id) {
        case 1:
        case 2:
        case 3:
        case 5:
        case 7:
        case 8:
        case 9:
        case 10:
            classElement += ' web';

        case 2:
        case 6:
        case 7:
        case 9:
        case 10:
            classElement += ' design';

        case 4:
        case 8:
            classElement += ' photography';

        case 8:
        case 11:
        case 12:
        case 13:
            classElement += ' branding';
    }

    return classElement;
}

// main
initListProducts(products);


// Action search
var input = document.getElementById('home-btn-search');
input.addEventListener('input', function()
{
    let arrProducts = products;
    let keyword = input.value;
    let arrResults = [];

    arrProducts.forEach((list) => {
        if (list.name.toLocaleLowerCase().search(keyword.toLocaleLowerCase()) > -1) {
            arrResults.push(list)
        }
    })

    initListProducts(arrResults)
});
