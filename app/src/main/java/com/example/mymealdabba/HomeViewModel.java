package com.example.mymealdabba;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mymealdabba.model.CuisineModel;
import com.example.mymealdabba.model.LocationModel;
import com.example.mymealdabba.model.MessFilterModel;
import com.example.mymealdabba.model.MessNameListModel;

public class HomeViewModel extends ViewModel {
   public MutableLiveData<LocationModel> _selectedLocation = new MutableLiveData<>();
   public LiveData<LocationModel> selectedLocation = _selectedLocation;

   public MutableLiveData<MessFilterModel> _filterMess = new MutableLiveData<>();
   public LiveData<MessFilterModel> filterMess = _filterMess;

   public MutableLiveData<MessNameListModel> _filterMessSearch = new MutableLiveData<>();
   public LiveData<MessNameListModel> filterMessSearch = _filterMessSearch;
}
