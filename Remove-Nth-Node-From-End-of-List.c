1/**
2 * Definition for singly-linked list.
3 * struct ListNode {
4 *     int val;
5 *     struct ListNode *next;
6 * };
7 */
8struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
9    struct ListNode temp;//dummy node
10    temp.next=head; //temp is a struct variable not a pointer so "->" doesnt work
11    struct ListNode* first=&temp;
12    struct ListNode* last= &temp;
13    for(int i=0;i<=n;i++) first=first->next; //move first pointer by n+1 steps(so first is n nodes ahead of last)
14    while(first!=NULL){//delay last pointer by n steps
15        first=first->next;
16        last=last->next;
17    }
18    struct ListNode* del = last->next;
19    last->next=last->next->next;
20    free(del);
21    return temp.next; //if we return head and free head then the return gives a dangling pointer 
22}