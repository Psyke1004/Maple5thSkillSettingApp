package psyke.maple5thskillsettingapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //레이아웃의 아이템들을 코틀린 코드와 연결
        var editSkill1 = findViewById<EditText>(R.id.editSkill1)
        var editSkill2 = findViewById<EditText>(R.id.editSkill2)
        var editSkill3 = findViewById<EditText>(R.id.editSkill3)
        var editSkill4 = findViewById<EditText>(R.id.editSkill4)
        var editSkill5 = findViewById<EditText>(R.id.editSkill5)
        var editSkill6 = findViewById<EditText>(R.id.editSkill6)

        var txtSkill1 = findViewById<TextView>(R.id.txtSkill1)
        var txtSkill2 = findViewById<TextView>(R.id.txtSkill2)
        var txtSkill3 = findViewById<TextView>(R.id.txtSkill3)
        var txtSkill4 = findViewById<TextView>(R.id.txtSkill4)
        var txtSkill5 = findViewById<TextView>(R.id.txtSkill5)
        var txtSkill6 = findViewById<TextView>(R.id.txtSkill6)

        var addCore = findViewById<Button>(R.id.btnCore)
        var btnResult = findViewById<Button>(R.id.btnResult)

        val item = Array(10,{""})

        mList.adapter = lv_Adapter(this,item)

        btnResult.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"준비중입니다.",Toast.LENGTH_SHORT).show()
        })
    }
}
