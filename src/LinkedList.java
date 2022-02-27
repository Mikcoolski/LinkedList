public class LinkedList
{   
  Node head;
  Node tail;
  int size;
  
      //constructor only used when creating a new EMPTY linked list
      public LinkedList()
      { 
        //Create a new empty node 
        this.head = new Node();
        //Since there is only one node we set the head and tail to be
        //the same node
        this.tail = head;
        this.size++;
      }

      //Create a new LinkedList with 1 node
      public LinkedList(int data)
      { 
        //Create a new node with the data value passed
        this.head = new Node(data);
        //Since there is only one node we set the head and tail to be
        //the same node
        this.tail = head;
        this.size++;
      }
  
      //Insert node at start of LinkedList
      public void addStart(int data)
      { 
        //first create the new node we are looking to insert. Make sure
        //the new Node is pointing to the head of the Linked List
        Node newNode = new Node(data,head);
        //after the new linkage is complete, we need to set the newly created node 
        //to now be the head of the node
        this.head = newNode;
        //We inserted a node so we increase the size
        this.size++;
      }
  
      //insert node at end of the linked list
      public void addEnd(int data)
      {
        //We fist create the new node we are looking to insert into the LinkedList
        //Since its at the end of the LinkedList we set the pointer to null
        Node newNode = new Node(data,null);
        //Point the current tail of the Linked list to the new node created
        this.tail.nextNode = newNode;
        //Now that the linkage is complete, set the new node to be the new tail
        this.tail=newNode;
        this.size++;
                
      }

      //Insert the new node at location specified 
      public void addAt(int data,int nodeLocation)
      {
        //setup the placeholder Node variables       
        Node nodeBeforeInsert = this.findNode(nodeLocation);
        if (nodeBeforeInsert.nextNode ==null)
        {
            //statment to add at end
            this.addEnd(data);
            this.size++;
        }
        else
        {
            Node nodeAfterInsert = nodeBeforeInsert.nextNode;  

            //Create the new node with the value provided
            Node newNode = new Node(data);
                            
            //Move the pointers of the three nodes in question  
            nodeBeforeInsert.nextNode = newNode;
            newNode.nextNode = nodeAfterInsert;
            this.size++;
        }        
      }

      //Delte the node at the given location
      public void deleteAt(int location)
      {
        //Node placeholders
        Node previousNode = this.head;
        Node currentNode = this.head.getNextNode();

        //check if node to be deleted is at head of LinkedList
        if(previousNode.value==location)
        {
            deleteStart();
        }
        else
        {
            //Loop through the LinkedList to find the value
            while(currentNode.value!=location)
            {   
                currentNode = currentNode.getNextNode();
                previousNode = previousNode.getNextNode();
            }
            
            //delete the node and rearrange pointers
            previousNode.nextNode = currentNode.getNextNode();
            currentNode.nextNode = null;
        }
      }

      //Find a given node
      public Node findNode(int data)
      {
        //Set the current node starting point to be the start of the LinkedList
        Node currentNode =this.head;
        
        //Loop through the entire Linked List 
        for(int i=0;i<=this.size; i++)
        {
          //Check if the current node is the one we are looking for
          if (currentNode.getData() == data)
          {
            //if found return the node
              return currentNode;
          }
          else
          {
            //update the current node to next node to continue chekcing for value
            currentNode = currentNode.getNextNode(); 
          }
        }

        //return null if the node is not found
        return null;
      }
  
      //delete node at end of the linked list
      public void deleteEnd()
      {
        Node currentNode = this.head;
        while(currentNode.getNextNode().nextNode != null)
        {
            currentNode = currentNode.getNextNode();
        }
        currentNode.nextNode = null;
      }
      
      // //delete node at start of the linked list
      public void deleteStart()
      {
          Node newHeadNode = this.head.getNextNode();
          this.head.nextNode= null;
          this.head = newHeadNode;          
      }

      //Display the contents of a Linked List
      public void Display()
      {
        //set current node
        Node currentNode = this.head;

        //Loop through the LinkedList and display each value in order
        while(currentNode!= null)
        {
            //print starting bracket only at start
            if(currentNode==head)
            {
                System.out.print("[");   
            }

            //print value
            System.out.print(currentNode.getData());
            
            //print last bracket only at end
            if(currentNode.getNextNode()==null)
            {   
                System.out.println("]");
            }
            //print the comma after each node value
            else
            {   
                System.out.print(",");
            }

            //increment to the next node
            currentNode = currentNode.getNextNode();
        }
      }
    }
