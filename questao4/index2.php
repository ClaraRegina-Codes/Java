<?php
 if($_SERVER["REQUEST_METHOD"]=="POST"){
	$i=$_POST['n'];
	
	echo"ordem crescente: <br>";
 	$cont=1;
	while ($cont<=$i){
		echo"$cont <br>";
		$cont++;
	}
	echo "<br><br> ordem decrescente: <br>";
	$a=1;
	while($a<=$i){
		echo"$i <br>";
		$i--;
	}
}
?>
