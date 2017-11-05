package example.hari.srccom.Nav_Slide_Version1;

/**
 * Created by Hari on 3/18/2017.
 *
 * * adapted from https://www.simplifiedcoding.net/android-mysql-tutorial-to-perform-basic-crud-operation/
 */

public class Config {



    //Address of our scripts of the CRUD


    public static final String URL_ADD="http://10.0.2.2/dashboard/android/CRUD_1/addEmp.php";
    public static final String URL_GET_ALL = "http://10.0.2.2/dashboard/android/CRUD_1/getAllEmp.php";
    public static final String URL_GET_EMP = "http://10.0.2.2/dashboard/android/CRUD_1/getEmp.php";
    public static final String URL_UPDATE_EMP = "http://10.0.2.2/dashboard/android/CRUD_1/updateEmp.php";
    public static final String URL_DELETE_EMP = "http://10.0.2.2/dashboard/android/CRUD_1/deleteEmp.php";


     /*
    public static final String URL_ADD="http://192.168.0.1/dashboard/android/CRUD/addEmp.php";
    public static final String URL_GET_ALL = "http://192.168.0.1/dashboard/android/CRUD/getAllEmp.php";
    public static final String URL_GET_EMP = "http://192.168.0.1/dashboard/android/CRUD/getEmp.php";
    public static final String URL_UPDATE_EMP = "http://192.168.0.1/dashboard/android/CRUD/updateEmp.php";
    public static final String URL_DELETE_EMP = "http://192.168.0.1/dashboard/android/CRUD/deleteEmp.php";
   */
    //Keys that will be used to send the request to php scripts
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAME = "name";
    public static final String KEY_EMP_DESG = "desg";
    public static final String KEY_EMP_SAL = "salary";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAME = "name";
    public static final String TAG_DESG = "desg";
    public static final String TAG_SAL = "salary";

    //employee id to pass with intent
    public static final String EMP_ID = "emp_id";
}
