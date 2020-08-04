package com.example.android0804;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button list,dialog,fragment;
    OneFragment oneFragment;
    FragmentManager fm;
    TwoFragment twoFragment;
    ThreeFragment threeFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (Button)findViewById(R.id.list);
        dialog = (Button)findViewById(R.id.dialog);
        fragment = (Button)findViewById(R.id.fragment);

        //FragmentManager 생성
        fm = getSupportFragmentManager();
        //Fragment 객체 새엇ㅇ
        oneFragment = new OneFragment();
        //화면을 갱신할 준비
        FragmentTransaction tf = fm.beginTransaction();
        tf.addToBackStack(null);
        //main_container 영역에 oneFragment를 출력
        tf.add(R.id.main_container,oneFragment);
        //화면을 갱신
        tf.commit();

        twoFragment = new TwoFragment();
        threeFragment = new ThreeFragment();



        //버튼들의 이벤트 처리 객체
        Button.OnClickListener handler = new Button.OnClickListener() {
            //이벤트 처리 메소드의 매개변수 정보를 이용하면 이벤트가 발생한 객체와 그 이벤트 처리를 위해
            //필요한 정보를 가져올 수 있습니다.
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.list :
                        FragmentTransaction tf1 = fm.beginTransaction();
                        tf1.replace(R.id.main_container,oneFragment);
                        tf1.addToBackStack(null);
                        tf1.commit();
                        break;

                    case R.id.dialog :
                        //대화 상자는 다른 프래그먼트와 교체되는 것이 아니고
                        //프래그먼트 위에 출력
                        if(twoFragment.isVisible() == false){
                            twoFragment.show(fm,null);
                        }
                        break;

                    case R.id.fragment :
                        FragmentTransaction tf3 = fm.beginTransaction();
                        tf3.replace(R.id.main_container,threeFragment);
                        tf3.addToBackStack(null);
                        tf3.commit();
                        break;
                }
            }
        };
        list.setOnClickListener(handler);
        dialog.setOnClickListener(handler);
        fragment.setOnClickListener(handler);

    }
}