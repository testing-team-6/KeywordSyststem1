package utility;
//存放所有用到的固定常量
public class Contants {
    //	定义访问地址
    public static  String url="http://localhost:8081/tm/web/client/welcome.action#item-management.action";
    //	定义驱动路径
    public static String driverUrl="src/chromedriver.exe";
    //	对象仓库文件路径
    public static String ObjectReUrl="/src/dataEngine/ObjectRepository";
    //	成功和失败
    public static  String fail="FAIL";
    public static  String pass="PASS";
    //	登陆的用户明和密码
    public static String userName="testadmin";
    public static String userPassword="123456";

    //选择项目名称
    public static String projectName = "test0316";

    //	Excel的路径和名称
    public static String excelFile="src/dataEngine/";
    public static String excelName = "这个是需要被下面两个代替的";
    public static String loginExcelName="LoginDataEngine.xls";
    public static String setQuestionExcelName = "SetQuestionDataEngine.xls";
    //	用例sheet页
    public static String caseSheet="Test Steps";
    //	用例场景的sheet页
    public static String suitSheet="Suite";
    //	Suite页的设置
    public static int suitTestSuiteId=0;
    public static int suitRunmode=2;
    public static int suitResult=3;
    //	用例步骤页的设置
    public static int stepTestSuiteId=0;
    public static int excelPOCloNum=4;
    public static int excelKWCloNum=5;
    public static int caseResult=6;
}