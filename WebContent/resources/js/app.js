var app = (()=>{
	return {
		init : (ctx)=>{
			playerService.login(ctx);
			playerService.join(ctx);
			playerService.move_join(ctx);
		}
	};
})();
var player = (()=>{
	var _playerId, _ePlayerName, _teamId, _joinYyyy, _position, _backNo, _nation, _birthDate, _solar, _height, _weight;
	var setPlayerId = (playerId)=>{this._playerId = playerId;}
	var setSolar = (solar)=>{this._solar = solar;}
	var getPlayerId = ()=>{return this._playerId;}
	var getSolar = ()=>{return this._solar;}
	return {
		setPlayerId : setPlayerId,
		setSolar: setSolar,
		getPlayerId : getPlayerId,
		getSolar : getSolar
	};
})();
var playerService = (()=>{
	return {
		login: (ctx)=>{
			$('#login_btn').click(()=>{
				if($('#username').val()===''||
						$('#solar').val()===''){
					alert('필수값이 업습니당!!');
				}else{
					alert('입력한 아이디값: '+$('#username').val()
							+'입력한 비번값: '+$('#solar').val());
					$('#login_form').attr('action', ctx+'/player.do');
					$('#login_form').submit();
				}
			});
		},
		join: (ctx)=>{
			$('#join_btn').click(()=>{
				if($('#join_playerId').val()===''||
						$('#join_solar').val()===''){
					alert('필수값이 업습니당!!');
				}else{
					alert('입력한 아이디값: '+$('#join_playerId').val()
							+'입력한 비번값: '+$('#join_solar').val());
					$('#join_form').attr('action', ctx+'/player.do');
					$('#join_form').submit();
				}
			});
		},
		move_join: (ctx)=>{
			$('#a_join').click(()=>{
				alert('회원가입 이동');
				location.assign(ctx+'/facade.do?action=move&page=join');
			});
		}
	};
})();