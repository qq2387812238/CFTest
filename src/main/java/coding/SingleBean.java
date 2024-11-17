package coding;

/**
 * 第一题：单例模式
 */
public class SingleBean {

    private static volatile SingleBean singleBean;

    private SingleBean() {
    }

    /**
     * 获取单例对象
     * 使用双重校验锁
     * @return 单例对象
     */
    public static SingleBean getSingleBean() {
        // 第一次判断，如果为空说明是第一次，直接创建对象
        if (singleBean == null) {
            // 加锁，保证线程安全，防止其他创建单例对象
            synchronized (singleBean) {
                // 第二次判断，如果为空说明没有其他线程创建过单例对象，直接创建对象
                if (singleBean == null) {
                    singleBean = new SingleBean();
                }
            }
        }

        return singleBean;
    }
}