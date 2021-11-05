package uz.pdp.samplelibrary

import android.content.Context
import android.widget.Toast

 class Toaster {
    companion object{
       fun toastsimple(context: Context,msg:String){
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        }
    }
}