package wood.mike
import grails.rest.*

@Resource(uri='/api/product')
class Product {

    String prodName
    String prodDesc
    Double prodPrice
    Date dateCreated

    static constraints = {
    }
}