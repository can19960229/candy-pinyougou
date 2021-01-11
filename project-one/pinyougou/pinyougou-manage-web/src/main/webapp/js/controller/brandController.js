app.controller('brandController',function ($scope,$controller,brandService) {


    $controller('baseController',{$scope:$scope});//继承
    // $controller也是angular提供的一个服务，可以实现伪继承，实际上就是与BaseController共享$scope

    //查询品牌列表
    $scope.findAll=function () {
        brandService.findAll().success(
            function (response) {
                $scope.list=response;
            }
        );
    }





    //分页
    $scope.findPage = function (page,rows) {
        brandService.findPage(page,rows).success(
            function (response) {
                $scope.list = response.rows;//显示当前页数据
                $scope.paginationConf.totalItems = response.total;//更新总记录数
            }
        );
    }

    //查询实体
    $scope.findOne=function (id) {
        brandService.findOne(id).success(
            function (response) {
                $scope.entity=response;	//
            }
        );
    }

    //新增
    $scope.save=function () {
        var object = null;

        if ($scope.entity.id != null){
            object=brandService.update($scope.entity);
        }else {
            object=brandService.add($scope.entity);
        }
        object.success(
            function (response) {
                if (response.success){
                    $scope.reloadList();//成功就刷新
                }else{
                    alert(response.message);//失败就弹出错误框
                }
            }
        );
    }



    //批量删除
    $scope.dele = function () {
        if (confirm('确定要删除吗？')){
            brandService.dele($scope.selectIds).success(
                function (response) {
                    if (response.success){
                        $scope.reloadList();//刷新品牌列表
                    }else {
                        alert(response.message);
                    }
                }
            );
        }

    }

    $scope.searchEntity={};		//如果不初始化会显示不出来数据
    //条件查询
    $scope.search=function (page,rows) {
        brandService.search(page,rows,$scope.searchEntity).success(
            function (response) {
                $scope.list = response.rows;//显示当前页数据
                $scope.paginationConf.totalItems = response.total;//更新总记录数
            }
        );
    }

});
