class Book(var title: String) {

    var paragraphs: MutableList<String> = mutableListOf()
    var images: MutableList<String> = mutableListOf()
    var tables: MutableList<String> = mutableListOf()


    fun createNewParagraph(paragraph: String) {
        paragraphs.add(paragraph)
    }

    fun createNewImage(image: String) {
        images.add(image)
    }

    fun createNewTable(table: String) {
        tables.add(table)
    }

    fun removeParagraph(paragraph: String){
        if (paragraphs.any { it == paragraph })
        paragraphs.remove(paragraph)
    }

    fun removeImage(img: String){
        if (images.any { it == img })
        images.remove(img)
    }

    fun removeTable(table: String){
        if (tables.any { it == table })
        tables.remove(table)
    }


    fun print() {
        print("\nBook(title=$title,paragraphs=$paragraphs,images=$images,tables=$tables)")
    }

    override fun toString(): String {
        return "Book(title='$title', paragraphs=$paragraphs, images=$images, tables=$tables)"
    }

}

