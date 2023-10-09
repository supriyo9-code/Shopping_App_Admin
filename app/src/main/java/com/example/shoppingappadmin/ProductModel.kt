package com.example.shoppingappadmin

class ProductModel {
    var name: String=""
    var price: Double=-1.0
    var disp: String=""
    var image: String=""

    constructor(name: String, price: Double, disp: String, image: String) {
        this.name = name
        this.price = price
        this.disp = disp
        this.image = image
    }

    constructor()
}