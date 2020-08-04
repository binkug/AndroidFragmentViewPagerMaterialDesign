package com.example.android0804;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.ListFragment;

public class OneFragment extends ListFragment {
    @Override
    public void onViewCreated( View view, Bundle savedInstanceState) {
        //상위 클래스의 메소드를 호출
        super.onViewCreated(view, savedInstanceState);
        //출력할 데이터 생성
        // 출력을 할 때 변화가 생길꺼 같으면 List
        // 변화가 생기지 않을꺼 같으면 배열
        String [] oop = {"A","B","C"};
        //Adapter 생성
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1,oop);
        //어댑터 연결
        this.setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView list, View v, int position, long id) {
        //listView는 이벤트가 발생한 listView
        //v 는 이벤트가 발생한 항목의 뷰
        //position은 누른 항목의 인덱스
        super.onListItemClick(list, v, position, id);
        //선택한 데이터 찾아오기
        String item = (String)list.getAdapter().getItem(position);
        //토스트 출력
        Toast.makeText(getActivity(),item,Toast.LENGTH_LONG).show();
    }
}
