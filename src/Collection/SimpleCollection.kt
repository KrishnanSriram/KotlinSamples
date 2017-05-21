package Collection

/**
 * Created by sriramk on 5/20/2017.
 */
fun main(args: Array<String>) {
    val myAddress = listOf<Any>("Krishnan", "Sriram", 37, 527, "Tansy ln", "Westerville", 43081)
    println("My Address")
    println(myAddress)

    val myFamily = arrayListOf<String>("Krishnan Sriram", "Indhra Vedantham", "Avyukth Krishnan")

    fun reversePrintList(list: ArrayList<String>) {
        print("[")
        for((index, member) in list.reversed().withIndex()) {
            if(index == myFamily.size - 1)
                print(member)
            else
                print(member + ", ")
        }
        print("]")
        println("")
    }

    fun printList(list: ArrayList<String>, reverseOrder:Boolean = false) {
        if(reverseOrder == false) {
            println(list)
        } else {
            reversePrintList(myFamily);
        }

        println("Family size: ${myFamily.size}")
    }

    fun findItemInList(member: String?, inFamily:ArrayList<String>) {
        println("Find family member: ${member}")
        member?.let {
            if(inFamily.contains(member)) {
                println("Found ${member}")
            } else {
                println("Cannot find ${member}")
            }
        }
    }

    fun main() {
        printList(myFamily);
        findItemInList("Krishnan Sriram", myFamily)
        myFamily.add("Sriram Subramanian")
        myFamily.add("Jayanthi Sriram")
        printList(myFamily)
        findItemInList("Jayanthi Sriram", myFamily)
        findItemInList(null, myFamily)
        printList(myFamily, true)
    }

    main()
}