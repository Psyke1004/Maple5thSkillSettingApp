package psyke.maple5thskillsettingapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText

class lv_Adapter(context: Context, item:Array<String>) : BaseAdapter() {
    private val mContext = context
    private val mitem = item

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        lateinit var viewHolder: ViewHolder
        var view =  convertView
        if (view == null){
            viewHolder = ViewHolder()
            view = LayoutInflater.from(mContext).inflate(R.layout.lv_item,parent,false)

            viewHolder.check_Select =  view.findViewById(R.id.check_Select)

            viewHolder.edit_Item1 = view.findViewById(R.id.edit_Item1)
            viewHolder.edit_Item2 = view.findViewById(R.id.edit_Item2)
            viewHolder.edit_Item3 = view.findViewById(R.id.edit_Item3)
            viewHolder.edit_Item4 = view.findViewById(R.id.edit_Item4)
            viewHolder.edit_Item5 = view.findViewById(R.id.edit_Item5)
            viewHolder.edit_Item6 = view.findViewById(R.id.edit_Item6)

            viewHolder.btn_Delete = view.findViewById(R.id.btn_Delete)

            view.tag = viewHolder
            return view
        }else{
            viewHolder = view.tag as ViewHolder
        }
        return view
    }

    override fun getItem(position: Int)=mitem[position]

    override fun getItemId(position: Int) = position.toLong()

    override fun getCount() = mitem.size

    inner class ViewHolder{
        lateinit var check_Select:CheckBox

        lateinit var edit_Item1:EditText
        lateinit var edit_Item2:EditText
        lateinit var edit_Item3:EditText
        lateinit var edit_Item4:EditText
        lateinit var edit_Item5:EditText
        lateinit var edit_Item6:EditText

        lateinit var btn_Delete:Button
    }
}