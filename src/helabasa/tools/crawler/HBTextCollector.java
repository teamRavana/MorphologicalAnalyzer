 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . t o o l s . c r a w l e r ;  
  
 i m p o r t   h e l a b a s a . t o o l s . c r a w l e r . c o l l e c t o r s . H B W o r d C o l l e c t o r ;  
  
 p u b l i c   c l a s s   H B T e x t C o l l e c t o r   {  
  
 	 p u b l i c   s t a t i c   f i n a l   s h o r t   H B _ T X T _ W O R D   	 	 =   0 ;  
 	 p u b l i c   s t a t i c   f i n a l   s h o r t   H B _ T X T _ B I G R A M   	 =   1 ;  
 	 p u b l i c   s t a t i c   f i n a l   s h o r t   H B _ T X T _ T R I G R A M   	 =   2 ;  
 	  
 	 p r i v a t e   s t a t i c   f i n a l   S t r i n g [ ]   a r r _ T e x t C o l l e c t o r N a m e s   =   { " w o r d " ,   " b i g r a m " ,   " t r i g r a m " } ;      
 	 	 	  
 	 	 	  
 	  
 	 p u b l i c   H B T e x t C o l l e c t o r ( )    
 	 {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   c o n s t r u c t o r   s t u b  
 	 }  
 	  
 	  
 	 p u b l i c   v o i d   C o l l e c t T e x t ( S t r i n g   s T e x t )  
 	 {  
 	 	  
 	 }  
 	  
 	 p u b l i c   s t a t i c   H B T e x t C o l l e c t o r   C r e a t e C o l l e c t o r ( S t r i n g   s T y p e )  
 	 {  
 	 	 i f ( s T y p e . e q u a l s ( a r r _ T e x t C o l l e c t o r N a m e s [ H B _ T X T _ W O R D ] ) )  
 	 	 {  
 	 	 	 r e t u r n   n e w   H B W o r d C o l l e c t o r ( ) ;  
 	 	 }  
 	 	  
 	 	 r e t u r n   n e w   H B T e x t C o l l e c t o r ( ) ;  
 	 }  
 	 	  
 }  
