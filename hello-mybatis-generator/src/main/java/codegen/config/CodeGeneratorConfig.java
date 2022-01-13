package codegen.config;

/**
 * 配置信息变量
 */
public class CodeGeneratorConfig {

    public static boolean INITIALIZED = false;

    // JDBC 相关配置信息
    public static String JDBC_URL;
    public static String JDBC_USERNAME;
    public static String JDBC_PASSWORD;
    public static String JDBC_DRIVER_CLASS_NAME = "com.mysql.cj.jdbc.Driver";

    public static String GENERATE_TABLE;

    // 项目在硬盘上的基础路径
    public static final String PROJECT_PATH = System.getProperty("user.dir");
    // java文件路径
    public static String JAVA_PATH = "hello-mybatis-generator/target/out/src/main/java";
    // 资源文件路径
    public static String RESOURCES_PATH = "hello-mybatis-generator/target/out/src/main/resources";

    // 包的父目录
    public static String BASE_PACKAGE;
    // 项目 Model 所在包
    public static String MODEL_PACKAGE;
    // 项目 Mapper 所在包
    public static String MAPPER_PACKAGE;
    // 项目 Service 所在包
    public static String DAO_PACKAGE;
    // 项目 Service 所在包
    public static String MBG_DAO_PACKAGE;
    // 项目 Service 所在包
    public static String SERVICE_PACKAGE;


    // 生成的 Dao 存放路径
    public static String PACKAGE_PATH_MODEL;
    // 生成的 Dao 存放路径
    public static String PACKAGE_PATH_DAO;
    // 生成的 Service 存放路径
    public static String PACKAGE_PATH_SERVICE;

    // 模板注释中 @author
    public static String AUTHOR = "";
    // 模板注释中 @date
    public static String DATE;

}
