package thoughtworks.training.m05.data

interface Discountable {
    fun discount(item: ShoppingCartItem): Float
}

class BuyTwoSendOne : Discountable {

    private fun calculateDiscount(sum: Int ): Int{
       return sum - (sum - sum % 3) / 3
    }

    override fun discount(item: ShoppingCartItem): Float {
        return item.run { calculateDiscount(sum) * goods.price }
    }
}