 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   * /  
 p a c k a g e   h e l a b a s a ;  
  
 i m p o r t   j a v a . s q l . C o n n e c t i o n ;  
 i m p o r t   j a v a . s q l . D r i v e r M a n a g e r ;  
 i m p o r t   j a v a . s q l . S Q L E x c e p t i o n ;  
  
  
 p u b l i c   c l a s s   H B D a t a b a s e   {  
  
 	 p u b l i c   s t a t i c   S t r i n g   s _ D B _ H o s t N a m e   =   " l o c a l h o s t " ;   / / " 1 9 2 . 1 6 8 . 5 6 . 1 0 1 " ;   / /  
 	 p u b l i c   s t a t i c   S t r i n g   s _ D B _ P a s s w o r d   =   " @ h l b s " ;  
 	 p u b l i c   s t a t i c   b o o l e a n   b _ O f f l i n e   =   f a l s e ;  
 	  
 	  
 	 p u b l i c   H B D a t a b a s e ( )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   c o n s t r u c t o r   s t u b  
 	 }  
  
 	 p u b l i c   s t a t i c   b o o l e a n   I n i t ( )  
 	 {  
 	 	 r e t u r n   t r u e ;  
 	 }  
 	  
 	 p u b l i c   s t a t i c   v o i d   D i s c o n n e c t F r o m D B ( C o n n e c t i o n   o C o n )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	  
 	 	 	 r e t u r n ;  
 	 	 }  
 	 	  
 	 	 i f ( o C o n ! = n u l l )  
         	 {  
 	                 t r y   { 	                 	  
 	                 	 	 o C o n . c l o s e ( ) ; 	                 	         	 	  
 	                 }    
 	                 c a t c h   ( E x c e p t i o n   e x )   {  
 	                 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " \ n E R R O R   :   F a i l e d   t o   c l o s e   t h e   c o n n e c t i o n   :   "   +   e x . g e t M e s s a g e ( ) ) ;  
 	                 	 e x . p r i n t S t a c k T r a c e ( ) ;                 	    
 	                 } 	  
         	 }  
 	 }  
 	  
 	 p u b l i c   s t a t i c   C o n n e c t i o n   C o n n e c t T o D B ( )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	  
 	 	 	 r e t u r n   n u l l ;  
 	 	 }  
 	 	  
 	 	 S t r i n g   u r l   =   " j d b c : m y s q l : / / "   +   s _ D B _ H o s t N a m e   +   " / h e l a b a s a ? u s e U n i c o d e = t r u e & c h a r a c t e r E n c o d i n g = u t f - 8 " ;  
                 S t r i n g   u s e r   =   " h e l a b a s a " ;  
                 S t r i n g   p a s s w o r d   =   s _ D B _ P a s s w o r d ;  
                  
                 t r y   {  
                 	  
         	   	 t r y  
         	 	 {  
         	 	 	 C l a s s . f o r N a m e ( " c o m . m y s q l . j d b c . D r i v e r " ) ;  
         	 	 }  
         	 	 c a t c h ( E x c e p t i o n   e )  
         	 	 {  
         	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " \ n E R R O R   :   F a i l e d   t o   L o a d   t h e   D r i v e r   :   c o m . m y s q l . j d b c . D r i v e r " ) ;  
         	 	 	 / / e . p r i n t S t a c k T r a c e ( ) ;  
         	 	 }                 	  
                 	  
         	   	 r e t u r n   D r i v e r M a n a g e r . g e t C o n n e c t i o n ( u r l ,   u s e r ,   p a s s w o r d ) ;  
                 }    
                 c a t c h   ( S Q L E x c e p t i o n   e x )   {  
                          
                 	 / / e x . p r i n t S t a c k T r a c e ( ) ;  
                 	 r e t u r n   n u l l ;    
                 }  
                  
 	 }  
 	  
 }  
