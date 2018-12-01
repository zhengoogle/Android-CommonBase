package com.simple.common.$doc;

/**
 * JavaDoc内容
 *  REF:
 *      https://blog.csdn.net/qq_27093465/article/details/59121608
 */

/**
 * {@link} vs @see: @see标签前面不能有内容
 * {@link com.simple.common.$doc.JavaDoc}
 * {@link JavaDoc}
 * {@link com.simple.common.$doc.JavaDoc#jDoc}
 * placehold {@link com.simple.common.$doc.JavaDoc#getJavaDoc}
 *
 * @see  com.simple.common.$doc.JavaDoc
 * @see  JavaDoc
 * @see  com.simple.common.$doc.JavaDoc#jDoc
 * @see  com.simple.common.$doc.JavaDoc#getJavaDoc
 * placehold @see com.simple.baseframework.$doc.JavaDoc#getJavaDoc
 * @return
 */
public class JavaDoc {
    private String jDoc = "jDoc";

    /**
     *
     * @return
     */
    public static String getJavaDoc(){
        String docName = "docName";
        return "JavaDoc";
    }
}
