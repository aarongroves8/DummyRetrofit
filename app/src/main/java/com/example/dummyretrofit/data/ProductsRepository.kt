package com.example.dummyretrofit.data

import com.example.dummyretrofit.data.model.Product
import kotlinx.coroutines.flow.Flow
import kotlin.Result

interface ProductsRepository {

    suspend fun getProductsList(): Flow<com.example.dummyretrofit.data.Result<List<Product>>>
}