package com.example.android0804;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ThreeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //뷰를 전개할 때 첫번째는 뷰의 아이디
        //두번째 이 뷰가 놓이게 되는 레이아웃 - 부모 뷰
        //세번째 자신이 최상위 뷰인지 설정 - 부모 뷰가 될 수 있는지 여부
        return inflater.inflate(R.layout.threefragment,container,false);
    }
}
