package com.example.android0804;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;


public class TwoFragment extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        //대화상자 만들기
        //Android에서 대화상자는 메소드 체이닝을 이용해서 생성
        AlertDialog dialog = new AlertDialog.Builder(getActivity()).setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("대화상자 프로그래먼트").setMessage("대화상자 출력")
                .setPositiveButton("확인",null).create();
        return dialog;
    }
}
