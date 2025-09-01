
// Description: Java 11 MssCF Reference for TSecGrpInc Relationship Tenant.

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSecMssCF;

import java.sql.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cfcore.MssCF.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfsec.CFSecObj.*;

/**
 *	CFSecMssCFReferenceTSecGrpIncTenant binds TSecGrpInc.Tenant
 *	as an instance of MssCFGenReferenceObj.
 */
public class CFSecMssCFReferenceTSecGrpIncTenant
	extends MssCFGenReferenceObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFReferenceTSecGrpIncTenant() {
		super();
	}

	public CFSecMssCFReferenceTSecGrpIncTenant( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"TSecGrpInc",
			"Tenant",
			"Tenant" );
	}

	public ICFLibAnyObj dereference( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFReferenceTSecGrpIncTenant.dereference() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"genContext.getGenDef()" );
		}

		ICFSecTenantObj obj;

		if( genDef instanceof ICFSecTSecGrpIncObj ) {
			obj = (ICFSecTenantObj)((ICFSecTSecGrpIncObj)genDef).getRequiredOwnerTenant();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"genContext.getGenDef()",
				genDef,
				"ICFSecTSecGrpIncObj" );
		}

		return( obj );
	}
}
