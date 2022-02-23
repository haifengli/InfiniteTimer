package org.yellowtree.infinitetimer

sealed class ViewEvent {
    object LastItemEvent : ViewEvent()
    data class ViewRangeChangeEvent(val range: IntRange) : ViewEvent()
}