 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   * /  
 p a c k a g e   h e l a b a s a ;  
  
  
 p u b l i c   c l a s s   H B I r r e g u l a r F o r m   e x t e n d s   H B F o r m   {  
  
 	 p r i v a t e   S t r i n g   	 	 s _ S u f f i x   =   n u l l ; 	  
 	 p r i v a t e   s h o r t 	 	 i _ T y p e   =   0 ;  
 	 p r i v a t e   s h o r t 	 	 i _ S u b T y p e   =   0 ; 	  
 	 p u b l i c   s t a t i c   f i n a l   i n t   F O R M _ T Y P E _ I R R E G U L A R   =   1 ;  
 	  
 	 p u b l i c   H B I r r e g u l a r F o r m ( )   { 	  
 	 	 o _ F o r m 	 =   n u l l ;  
 	 	 s _ S u f f i x   =   " " ;  
 	 	 i _ T y p e   =   0 ;  
 	 	 i _ S u b T y p e   =   0 ; 	  
 	 	  
 	 }  
 	  
 	 p u b l i c   H B I r r e g u l a r F o r m ( S t r i n g   s F o r m ,   S t r i n g   s S u f f i x ,   s h o r t   i T y p e ,   s h o r t   i S u b T y p e )    
 	 { 	 	  
 	 	 o _ F o r m 	 =   n e w   H B W o r d ( s F o r m ) ; 	  
 	 	 s _ S u f f i x   =   s S u f f i x ;  
 	 	 i _ T y p e   =   i T y p e ;  
 	 	 i _ S u b T y p e   =   i S u b T y p e ;  
 	 }  
 	  
 	 p u b l i c   i n t   G e t F o r m T y p e ( )  
 	 {  
 	 	 r e t u r n   F O R M _ T Y P E _ I R R E G U L A R ;  
 	 }  
 	  
 	 p u b l i c   s h o r t   G e t T y p e ( )  
 	 {  
 	 	 r e t u r n   i _ T y p e ; 	 	  
 	 }  
 	  
 	 p u b l i c   s h o r t   G e t S u b T y p e ( )  
 	 {  
 	 	 r e t u r n   i _ S u b T y p e ; 	 	  
 	 }  
 	  
 	  
 	 p u b l i c   S t r i n g   G e t S u f f i x ( )  
 	 {  
 	 	 r e t u r n   s _ S u f f i x ;  
 	 }  
 	  
 	 p u b l i c   H B W o r d   G e t F o r m ( )  
 	 {  
 	 	 r e t u r n   o _ F o r m ;  
 	 }  
 	  
 	 p u b l i c   S t r i n g   G e t M o d i f i e r ( )  
 	 {  
 	 	 r e t u r n   " + "   +   s _ S u f f i x ;  
 	 }  
 	  
 }  
