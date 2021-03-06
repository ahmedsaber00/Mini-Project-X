package io.android.projectx.cache.base.mapper

interface CacheMapper<C, E> {

    fun mapFromCached(type: C): E

    fun mapToCached(entity: E): C

}