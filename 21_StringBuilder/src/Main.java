public class Main {
  public static void main(String[] args) {
      String[] fields = { "name", "position", "salary" };
      String table = "employee";
      String insert = buildInsertSql(table, fields);
      System.out.println(insert);
      String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
      System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
  }
  static String buildInsertSql(String table, String[] fields){
    return new StringBuilder().append("INSERT INTO ")
                              .append(table)
                              .append(" (")
                              .append(String.join(", ",fields))
                              .append(") VALUES (?, ?, ?)").toString();
  }
}

