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

//        문법 연습 (조건문)
//        나이를 확인해서 -> 성인인지/아닌지
        val userAge = 13

        if (userAge >= 20) {

            Log.d("성인판별","성인이 맞습니다.")

        }
        else if (userAge >= 17){
            Log.d("성인판별", "고등학생")
        }
        else if (userAge >= 14){
            Log.d("성인판별", "중학생")
        }
        else {
            Log.d("성인판별","성인이 아닙니다.")
        }

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