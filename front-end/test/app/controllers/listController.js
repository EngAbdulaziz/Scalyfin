listApp.controller('listController', function ($scope,listService) {

    $scope.getList = function () {
        listService.getListResult().then(function (result) {
            $scope.list = result;
        });
    }
    $scope.getList();

});
