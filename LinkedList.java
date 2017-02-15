/*
 * This program written by Michael Morrisey
for CSCI 211, Spring 2016 with Dr. Herbert

This program contains the structure for a linked list
and an inner class of ListNodes.
 */
package linkedlist;

/**
 *
 * @author Michael.T.Morrisey
 */
public class LinkedList {

    private int listLength = 0;

    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList myList = new LinkedList();
        
        
    }//end main()
    
    public LinkedList()
    {
        ListNode head = new ListNode();
    };//end LinkedList() null constructor
    
    public int getListLength()
    {
        return listLength;
    };//end getListLength()
    
    public void addNode(ListNode myNode)
    {
        ListNode tempNode;
        tempNode = head.getPointer();    
    };//end addNode
    
    class ListNode
        {
            private String name; // the data contained in the list
            private ListNode pointer; // a pointer to the next Node in the list
            
            //null constructor
            public ListNode()
            {
                pointer = null;
            };//end ListNode() null constructor
            
            //initializing constructor
            public ListNode(String myName, ListNode next)
            {
                name = myName;
                pointer = next;
            };//end ListNode() initializing constructor
            
            
            //mutator methods
            public void setName(String myName)
            {
                name = myName;
            };//end setName()
            
            public String getName()
            {
                return name;
            };//end getName;
            
            public void setPointer(ListNode myPointer)
            {
                pointer = myPointer;
            };//end setPointer()
            
            public ListNode getPointer()
            {
                return pointer;
            };//end getPointer;
            
            
            
        }//end class ListNode
    
    
}//end class LinkedList
