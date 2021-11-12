import android.util.Log

object LoggerUtil {
    fun logMe(tag:String="Logme",message:String=""){
        Log.d(tag,message)
    }
}