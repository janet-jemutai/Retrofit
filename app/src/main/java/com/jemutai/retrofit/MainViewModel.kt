package com.jemutai.retrofit

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jemutai.retrofit.api.RetrofitInstance

private  const val TAG ="MainViewModel"
class MainViewModel : ViewModel(){
    private   val  _isLoading = MutableLiveData("false")
     val  isLoading: MutableLiveData<String>

         get() = _isLoading
    fun  getPost(){
        viewModelScope.launch{
            val fetchPosts = RetrofitInstance.api.getPosts()
            fetchPosts
        }

    }
}