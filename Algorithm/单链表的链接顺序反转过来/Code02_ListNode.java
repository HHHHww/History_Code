public class Code02_ListNode {
    public static void main(String[] args) {
        Node node5=new Node(5,null);
        Node node4=new Node(4,node5);
        Node node3=new Node(3,node4);
        Node node2=new Node(2,node3);
        Node node1=new Node(1,node2);
        Node prev=reverseLinkedList(node1);
        System.out.println(prev.toString());}
    public static Node reverseLinkedList(Node head) {
// 此处写入算法
        Node a=null;
        Node nodeqian=null;
        Node nodehou=null;
        for(a=head;a!=null;a=nodehou){
        nodehou=a.next;
        a.next=nodeqian;
        nodeqian=a;}

        return nodeqian;

    }
    }

class Node<T>                             // 单链表结点类，T指定结点的元素类型
{
    public T data;                               // 数据域，存储数据元素
    public Node<T> next;                         // 地址域，引用后继结点

    public Node(T data, Node<T> next)            // 构造结点，data指定数据元素，next指定后继结点
    {
        this.data = data;                        // T对象引用赋值
        this.next = next;                        // Node<T>对象引用赋值
    }
    public Node()
    {
        this(null, null);
    }

    //没有直接调用。为了调试时用的。
    public String toString()                     // 返回结点数据域的描述字符串
    {
        String shuchu="";
        for(Node a=this;a!=null;a=a.next){
            if(a==this){
                shuchu+=a.data;
            }
            else{shuchu=shuchu+"->"+a.data;}
        }
        return shuchu;
    }
}