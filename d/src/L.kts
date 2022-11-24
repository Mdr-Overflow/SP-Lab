
class ImageLoaderFactory(Atribute: String) {

    fun create(toCreate: String) {
        when (toCreate.substringAfterLast('.')) {
            "bmp" -> BMPImageLoader()
            "jpg" -> JPGImageLoader()
            else -> throw Exception("I don't know how to deal with $toCreate.")
        }



    }}


class AlignmentStrategyFactory(StrategiesPrototypes: String){
    var AlignmentStrategy = null
    fun create(textAlignment: String) {
        when (textAlignment.substringAfterLast('.')) {
            "left" -> AlignmentStrategy = AlignLeft()
            "right" -> AlignmentStrategy = AlignRight()
            else -> throw Exception("I don't know how to deal with $textAlignment.")

        }



    }}



