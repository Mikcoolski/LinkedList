public class Node
{      
    int value;
    Node nextNode;

  //constructor for the node with 0 arguments
  public Node()
  {
    
  }

  //Constructor for the node with 1 arguments
  public Node(int data)
  {
    //Set the values of the current node in context to the predetermined value
    this.value = data;
    this.nextNode = null;
  }

  //Constructor for the node with 2 arguments
  public Node(int data, Node next)
  {
    //Set the values of the current node in context to the predetermined value
    this.value = data;
    //set the pointer to the next node provided
    this.nextNode = next;
  }

  //getdata
  public int getData()
  {
    return this.value;
    
  }

  //setdata
  public void setData(int data)
  {
     this.value = data;
    
  }

  //get next node
  public Node getNextNode()
  {
    return this.nextNode;
  }
  
  //set next node
  public void setNextNode(Node node)
  {
    this.nextNode= node;
  }
}   