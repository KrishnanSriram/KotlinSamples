package Generics

/**
 * Created by sriramk on 5/21/2017.
 */
class SimpleStack<T> {
    private var items: ArrayList<T>

    init {
        this.items = ArrayList<T>()
    }

    fun push(item: T) {
        this.items.add(item)
    }

    fun pop(): T? {
        if(this.items.isEmpty()) {
            return null
        }
        val topItemIndex = this.items.size - 1
        return this.items.removeAt(topItemIndex)
    }

    fun isEmpty(): Boolean {
        return true
    }

    override fun toString(): String {
        return this.items.toString()
    }
}