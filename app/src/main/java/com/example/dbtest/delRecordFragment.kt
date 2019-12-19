package com.example.dbtest
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.dbtest.Database.Student
import kotlinx.android.synthetic.main.fragment_del_record.*
import kotlinx.android.synthetic.main.fragment_view_record.*
import kotlinx.android.synthetic.main.fragment_view_record.txtResult

/**
 * A simple [Fragment] subclass.
 */
class delRecordFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_del_record, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

            //display Data
            val sList : List<Student> = MainActivity.appDB.studentDao().getAll()

            var name:String = ""

            for(s in sList){
                name = name + s.studentid + " " + s.studentName + "\n"
            }

            txtResult.setText(name)

        btnDel.setOnClickListener(){
            val id = delId.text.toString()

            val s = Student(id,"","")

            MainActivity.appDB.studentDao().delete(s)
            //Toast.makeText(context, id, Toast.LENGTH_LONG).show()
        }
    }
}
