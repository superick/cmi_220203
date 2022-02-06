package com.example.cmi_220203

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        문법 연습(변수)

//        변수 만들기
        val myName = "슈퍼릭" // 변수 생성 + 대입 => 변수의 초기화

        Log.d("변수값", myName)



        clickBtn.setOnClickListener {

            // 주석
//            ctrl + / 도 주석
            Log.d("메인화면로그","클릭용 버튼 눌림")
            Log.e("메인화면로그","에러 관련 로그")

        }

        smallBtn.setOnClickListener {
            Toast.makeText(this, "작은 버튼 눌림", Toast.LENGTH_SHORT).show()


        }



    }
}