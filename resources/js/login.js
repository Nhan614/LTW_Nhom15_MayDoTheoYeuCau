const adressbtn = document.querySelector('#adress-form')
const adressclose = document.querySelector('.close-btn')
// console.log (adressbtn)
adressbtn.addEventListener("click", function() {
    document.querySelector('.adress-form').style.display = 'flex'
})
adressclose.addEventListener("click", function() {
    document.querySelector('.adress-form').style.display = 'none'
})

// shop
const shopbtn = document.querySelector('#shop-address')
const shopclose = document.querySelector('.close-button')
// console.log (adressbtn)
shopbtn.addEventListener("click", function() {
    document.querySelector('.shop-address').style.display = 'flex'
})
shopclose.addEventListener("click", function() {
    document.querySelector('.shop-address').style.display = 'none'
})
