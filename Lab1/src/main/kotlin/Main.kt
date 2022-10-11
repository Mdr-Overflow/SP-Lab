fun main(args: Array<String>) {
    val aNormalBook = Book("Just A Normal Book")

    aNormalBook.createNewParagraph("Paragraph 1")
    aNormalBook.createNewParagraph("Paragraph 2")
    aNormalBook.createNewParagraph("Paragraph 3")
    aNormalBook.createNewImage("Image 1")
    aNormalBook.createNewParagraph("Paragraph 4")
    aNormalBook.createNewTable("Table 1")
    aNormalBook.createNewParagraph("Paragraph 5")
    aNormalBook.images.add("Image 2")
    aNormalBook.print()
    aNormalBook.removeParagraph("Wrong Paragraph")
    aNormalBook.removeImage("Some Image")
    aNormalBook.removeTable("Table 1")
    aNormalBook.print()
}
