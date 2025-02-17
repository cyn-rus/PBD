using UnityEngine;

public class ShootCommand : Command
{
    PlayerShooting playerShooting;

    public ShootCommand(PlayerShooting _playerShooting) {
        this.playerShooting = _playerShooting;
    }

    public override void Execute() {
        playerShooting.Shoot();
    }

    public override void UnExecute() {

    }
}
