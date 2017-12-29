package com.example.tuxzx.coolweather;

import android.app.ProgressDialog;
import android.support.v4.app.Fragment;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.tuxzx.coolweather.db.City;
import com.example.tuxzx.coolweather.db.County;
import com.example.tuxzx.coolweather.db.Province;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tuxzx on 2017/12/29.
 */

public class ChooseAreaFragment extends Fragment {
    public static final int LEVEL_PROVINCE = 0;
    public static final int LEVEL_CITY = 0;
    public static final int LEVEL_COUNTY = 0;

    private ProgressDialog progressDialog;
    private TextView titleText;
    private Button backButton;
    private ListView listView;

    private ArrayAdapter<String> adapter;
    private List<String> dataList = new ArrayList<>();

    //  省列表
    private List<Province> provinceList;
    //  市列表
    private List<City> cityList;
    //  县列表
    private List<County>
    //  选中的省份
    //  选中的城市
    //  当前选中的级别
}
