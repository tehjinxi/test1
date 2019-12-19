package com.example.dbtest


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dbtest.Database.Student
import kotlinx.android.synthetic.main.fragment_view_record.*

/**
 * A simple [Fragment] subclass.
 */
class ViewRecordFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_record, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnGet.setOnClickListener(){

            //display Data
            val sList : List<Student> = MainActivity.appDB.studentDao().getAll()

            var name:String = ""
//
            for(s in sList){
               name = name + s.studentid + " " + s.studentName + "\n"
            }
//
          txtResult.setText(name)
        }
    }
}
