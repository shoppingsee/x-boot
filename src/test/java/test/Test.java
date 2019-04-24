package test;

import cn.exrick.xboot.common.utils.SnowFlakeUtil;

/**
 * Test
 *
 * @author sxp
 * @since 2019/4/24
 */
public class Test {
  public static void main(String[] args) {
    String id = String.valueOf(SnowFlakeUtil.getFlowIdInstance().nextId());
    System.out.println(id);
  }
}
