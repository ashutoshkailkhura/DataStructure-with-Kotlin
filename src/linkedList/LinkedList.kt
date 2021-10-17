package linkedList

import utils.Node

class LinkedList<T : Any> {

    var head: Node<T>? = null
    var tail: Node<T>? = null
    var size = 0

    override fun toString(): String {
        if (isEmpty()) {
            return "Empty list"
        }
        return head.toString()
    }

    fun isEmpty(): Boolean = size == 0

    fun push(value: T) {

        head = Node(value = value, next = head)

        if (isEmpty()) {
            tail = head
        }

        size++
    }
}